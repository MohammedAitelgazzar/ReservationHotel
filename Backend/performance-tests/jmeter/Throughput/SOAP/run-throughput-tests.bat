@echo off
setlocal EnableDelayedExpansion

cd /d "%~dp0"

:: Nettoyer les anciens résultats
echo Cleaning old results...
if exist "throughput-results" (
    echo Removing old results directory...
    rmdir /s /q "throughput-results"
    timeout /t 2 >nul
)

:: Créer les dossiers
echo Creating directories...
mkdir throughput-results\test-10\run1
mkdir throughput-results\test-10\run2
mkdir throughput-results\test-10\run3
mkdir throughput-results\test-100\run1
mkdir throughput-results\test-100\run2
mkdir throughput-results\test-100\run3
mkdir throughput-results\test-500\run1
mkdir throughput-results\test-500\run2
mkdir throughput-results\test-500\run3
mkdir throughput-results\test-1000\run1
mkdir throughput-results\test-1000\run2
mkdir throughput-results\test-1000\run3
mkdir throughput-results\final-report
timeout /t 2 >nul

:: Test with 10 users (3 runs)
echo.
echo ========================================
echo Running tests with 10 users...
echo ========================================

echo Run 1/3
call jmeter -n -t "test-10-users.jmx" -l "throughput-results/test-10/run1/results.jtl" -e -o "throughput-results/test-10/run1/report"
echo Run 1 completed.
timeout /t 30

echo Run 2/3
call jmeter -n -t "test-10-users.jmx" -l "throughput-results/test-10/run2/results.jtl" -e -o "throughput-results/test-10/run2/report"
echo Run 2 completed.
timeout /t 30

echo Run 3/3
call jmeter -n -t "test-10-users.jmx" -l "throughput-results/test-10/run3/results.jtl" -e -o "throughput-results/test-10/run3/report"
echo Run 3 completed.

echo.
echo Waiting 60 seconds before next test...
timeout /t 60

:: Test with 100 users (3 runs)
echo.
echo ========================================
echo Running tests with 100 users...
echo ========================================

echo Run 1/3
call jmeter -n -t "test-100-users.jmx" -l "throughput-results/test-100/run1/results.jtl" -e -o "throughput-results/test-100/run1/report"
echo Run 1 completed.
timeout /t 30

echo Run 2/3
call jmeter -n -t "test-100-users.jmx" -l "throughput-results/test-100/run2/results.jtl" -e -o "throughput-results/test-100/run2/report"
echo Run 2 completed.
timeout /t 30

echo Run 3/3
call jmeter -n -t "test-100-users.jmx" -l "throughput-results/test-100/run3/results.jtl" -e -o "throughput-results/test-100/run3/report"
echo Run 3 completed.

echo.
echo Waiting 60 seconds before next test...
timeout /t 60

:: Test with 500 users (3 runs)
echo.
echo ========================================
echo Running tests with 500 users...
echo ========================================

echo Run 1/3
call jmeter -n -t "test-500-users.jmx" -l "throughput-results/test-500/run1/results.jtl" -e -o "throughput-results/test-500/run1/report"
echo Run 1 completed.
timeout /t 30

echo Run 2/3
call jmeter -n -t "test-500-users.jmx" -l "throughput-results/test-500/run2/results.jtl" -e -o "throughput-results/test-500/run2/report"
echo Run 2 completed.
timeout /t 30

echo Run 3/3
call jmeter -n -t "test-500-users.jmx" -l "throughput-results/test-500/run3/results.jtl" -e -o "throughput-results/test-500/run3/report"
echo Run 3 completed.

echo.
echo Waiting 60 seconds before next test...
timeout /t 60

:: Test with 1000 users (3 runs)
echo.
echo ========================================
echo Running tests with 1000 users...
echo ========================================

echo Run 1/3
call jmeter -n -t "test-1000-users.jmx" -l "throughput-results/test-1000/run1/results.jtl" -e -o "throughput-results/test-1000/run1/report"
echo Run 1 completed.
timeout /t 30

echo Run 2/3
call jmeter -n -t "test-1000-users.jmx" -l "throughput-results/test-1000/run2/results.jtl" -e -o "throughput-results/test-1000/run2/report"
echo Run 2 completed.
timeout /t 30

echo Run 3/3
call jmeter -n -t "test-1000-users.jmx" -l "throughput-results/test-1000/run3/results.jtl" -e -o "throughput-results/test-1000/run3/report"
echo Run 3 completed.

:: Calculate averages
echo.
echo ========================================
echo Calculating throughput averages...
echo ========================================
call python calculate_throughput.py

echo.
echo ========================================
echo All tests completed!
echo Check throughput-results/final-report for the summary.
echo ========================================
echo.
echo Press any key to close...
pause >nul