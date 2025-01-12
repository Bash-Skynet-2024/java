# Set paths
$javaFilePath = "$env:USERPROFILE\Desktop\Main.java"
$compiledClassPath = "$env:USERPROFILE\Desktop\Main.class"
$manifestPath = "$env:USERPROFILE\Desktop\manifest.txt"
$jarFilePath = "$env:USERPROFILE\Desktop\Main.jar"
$startupBatchPath = "$env:APPDATA\Microsoft\Windows\Start Menu\Programs\Startup\hello_world.bat"

# Check if JDK is installed
if (-not (Get-Command javac -ErrorAction SilentlyContinue)) {
    Write-Host "JDK is not installed or not added to PATH. Please install JDK and add it to your PATH environment variable."
    exit 1
}

# Step 1: Compile the Java file
if (Test-Path $javaFilePath) {
    Write-Host "Compiling $javaFilePath..."
    & javac $javaFilePath
    if (-Not (Test-Path $compiledClassPath)) {
        Write-Host "Compilation failed. Please check your Java code for errors."
        exit 1
    }
    Write-Host "Compilation successful."
} else {
    Write-Host "Java file not found at $javaFilePath. Please save your code as Main.java on the Desktop."
    exit 1
}

# Step 2: Create manifest file for JAR
Write-Host "Creating manifest file..."
Set-Content -Path $manifestPath -Value "Main-Class: Main`n"
Write-Host "Manifest file created."

# Step 3: Create JAR file
Write-Host "Packaging into JAR file..."
& jar cfm $jarFilePath $manifestPath $compiledClassPath
if (-Not (Test-Path $jarFilePath)) {
    Write-Host "Failed to create JAR file. Please check your setup."
    exit 1
}
Write-Host "JAR file created successfully at $jarFilePath."

# Step 4: Create batch file for startup
Write-Host "Creating startup batch file..."
Set-Content -Path $startupBatchPath -Value "java -jar `"$jarFilePath`""
Write-Host "Startup batch file created at $startupBatchPath."

# Step 5: Run the JAR file
Write-Host "Running the program..."
Start-Process -FilePath "java" -ArgumentList "-jar `"$jarFilePath`""

Write-Host "Program is running. It will restart automatically after a reboot."
