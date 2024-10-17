@echo off

REM Navigate to the directory containing the Dockerfile
cd C:\ProgramData\Jenkins\.jenkins\workspace\docker-jenkines

REM Step 1: Login to Docker Hub (optional; can also be done manually)
echo Logging in to Docker Hub...
docker login -u gautamrishig -p your_password

REM Step 2: Build the Docker image
echo Building the Docker image...
docker build -t sbdockerjenkines:latest .

REM Step 3: Tag the image for Docker Hub
echo Tagging the image...
docker tag sbdockerjenkines:latest gautamrishig/sbdockerjenkines:latest

REM Step 4: Push the Docker image to Docker Hub
echo Pushing the image to Docker Hub...
docker push gautamrishig/sbdockerjenkines:latest

REM Check for success or failure
if %ERRORLEVEL% neq 0 (
    echo "Error: Docker push failed!"
    exit /b 1
) else (
    echo "Docker image pushed successfully!"
)

exit /b 0
