[![Build Status](https://travis-ci.org/skokaina/devops.svg?branch=develop)](https://travis-ci.org/skokaina/devops)

# devops
Template project for CI/CD

## How to implement CI on your project with Travis for a Java project


### Link Github to Travis

1. Go to Travis-ci.com and Sign up with GitHub.
2. Accept the Authorization of Travis CI. You’ll be redirected to GitHub.
3. Click the green Activate button, and select the repositories you want to use with Travis CI.
4. Add a .travis.yml (YAML format) file to your repository, at the source folder, to tell Travis CI what to do.
```
cache:
  directories:
  - $HOME/.m2
language: java
jdk:
- oraclejdk8
```
5. Trigger a build manually on travis or make a push to the develop branch for an automated one.

You can get further information about travis build lifecycle customisation on [Travis Doc](https://docs.travis-ci.com/user/customizing-the-build/#Customizing-the-Build-Step)

### Integrate SonarCloud Quality Gates

TO BE DONE

### Github Pull Request Review using Sonar

TO BE DONE

### Deploy to Nexus

TO BE DONE