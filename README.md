09-20-2022
    1. Created a simple Rest endpoint to return random numbers.
    2. Pushed simple project to github, ignoring certain files like
       * mvn*
       * .gitignore
       * .idea
    3. Then set up Github Actions, to listen for master branch push/pul request 
       and kick off builds against multiple OS.
    4. Next step, storing docker images in a registry, also creating secrets??
       May have to pivot it to gitlabs if github doesn't have a free source for registry.

10-25-2022
    1. Updated ci.yml file to check current directory AND target directory to see what files are available.
    2. The goal being to build a docker image after this, we have the jar available now. Now need to use it to
    create a docker image.
    3. Also simplified Dockerfile for now, kept the fancy copy-pasta in the Dockerfile.fancy in case I want to reference
    it later.

10-26-2022
    1. WE HAVE SUCCEEDED IN CREATING THE DOCKER IMAGE AND PUSHING TO DOCKERHUB.
    2. Turns out macOS is a bitch, doesn't support Docker in the VM, so we can't use the login-action@v2.
    3. Removed Windows because it was taking too long, but it's also a bitch and can't use the prebuilt actions.
    4. But success, we are halfway on the cloud.