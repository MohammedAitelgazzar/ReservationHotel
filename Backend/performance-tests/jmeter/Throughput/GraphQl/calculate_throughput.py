import json
from pathlib import Path

def load_statistics(users, run):
    path = Path(f'throughput-results/test-{users}/run{run}/report/statistics.json')
    with open(path) as f:
        return json.load(f)

def calculate_throughput_summary():
    user_counts = [10, 100, 500, 1000]
    summary = {
        'throughput_by_users': {},
        'overall_average': 0
    }
    
    report = "Throughput Test Results\n=====================\n"
    
    for users in user_counts:
        total_throughput = 0
        runs_data = []
        
        # Calculate average for each run
        for run in range(1, 4):
            try:
                stats = load_statistics(users, run)
                throughput = stats['Total']['throughput']
                total_throughput += throughput
                runs_data.append(throughput)
                
                report += f"\n{users} Users - Run {run}:\n"
                report += f"- Throughput: {throughput:.2f} req/sec\n"
                report += f"- Average Response Time: {stats['Total']['meanResTime']:.2f} ms\n"
                report += f"- Error Rate: {stats['Total']['errorPct']:.2f}%\n"
                
            except Exception as e:
                print(f"Error loading results for {users} users, run {run}: {e}")
                
        # Calculate average throughput for this user count
        if runs_data:
            avg_throughput = total_throughput / len(runs_data)
            summary['throughput_by_users'][users] = avg_throughput
            
            report += f"\nAverage Throughput for {users} users: {avg_throughput:.2f} req/sec\n"
            report += "----------------------------------------\n"
    
    # Calculate overall average
    if summary['throughput_by_users']:
        summary['overall_average'] = sum(summary['throughput_by_users'].values()) / len(summary['throughput_by_users'])
        report += f"\nOverall Average Throughput: {summary['overall_average']:.2f} req/sec\n"
    
    # Save reports
    Path('throughput-results/final-report').mkdir(parents=True, exist_ok=True)
    
    with open('throughput-results/final-report/summary.txt', 'w', encoding='utf-8') as f:
        f.write(report)
    
    with open('throughput-results/final-report/averages.json', 'w', encoding='utf-8') as f:
        json.dump(summary, f, indent=2)
    
    print("\nSummary generated successfully!")
    print("Check throughput-results/final-report/summary.txt for results")

if __name__ == '__main__':
    calculate_throughput_summary()