fastlane documentation
================
# Installation

Make sure you have the latest version of the Xcode command line tools installed:

```
xcode-select --install
```

Install _fastlane_ using
```
[sudo] gem install fastlane -NV
```
or alternatively using `brew cask install fastlane`

# Available Actions
## Android
### android test_lint
```
fastlane android test_lint
```
Runs all the tests 
### android deploy
```
fastlane android deploy
```
Deploy a new version to the Google Play
### android beta
```
fastlane android beta
```

### android auto_screenshot
```
fastlane android auto_screenshot
```
 auto screenshots  
### android crashlytics_beta
```
fastlane android crashlytics_beta
```
Auto upload a new build to Crashlytics Beta in Fabric 

----

This README.md is auto-generated and will be re-generated every time [fastlane](https://fastlane.tools) is run.
More information about fastlane can be found on [fastlane.tools](https://fastlane.tools).
The documentation of fastlane can be found on [docs.fastlane.tools](https://docs.fastlane.tools).
