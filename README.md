[![Build Status](https://travis-ci.org/skokaina/devops.svg?branch=develop)](https://travis-ci.org/skokaina/devops)

[![Quality Gate](https://sonarcloud.io/api/project_badges/measure?project=skokaina_devops&metric=alert_status)](https://sonarcloud.io/dashboard?id=skokaina_devops) 

https://sonarcloud.io/api/project_badges/measure?project=skokaina_devops&metric=alert_status


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

1. Go to Sonarcloud.io and login with Github
2. Click on the + button on the top right and select "Create new project" 
3. Click on "Install SonarCloud Github application", select the repository you want sonar to activated for, click on install
4. Back on sonarcloud, select your project and click on create
5. Provide a token name, click on generate, this is the value that will be used for $SONAR_LOGIN variable (note your project key and project organisation key on the right section)
6. Edit your travis.yml and add a script step, to override the default build and test phase
```
cache:
  directories:
  - $HOME/.m2
language: java
jdk:
- oraclejdk8
script: ./build.sh
```
7. Add a build.sh to the repository root
```
if [ ${TRAVIS_PULL_REQUEST} = 'false' ] && [[ $TRAVIS_BRANCH = 'master'  ||  ${TRAVIS_BRANCH} = 'develop' ]]; then
      echo 'Checking Quality Gates'
      mvn --batch-mode clean verify org.sonarsource.scanner.maven:sonar-maven-plugin:3.4.0.905:sonar 
      -Dsonar.host.url=${SONAR_URL} 
      -Dsonar.login=${SONAR_LOGIN} 
      -Dsonar.organization=${SONAR_ORGANIZATION};
fi
```
8. Checkin the build.sh file with execution permission
```
git update-index --add --chmod=+x build.sh
git commit -m 'Make build.sh executable'
git push
```

### Github Pull Request Review using Sonar

TO BE DONE

### Deploy to Nexus

TO BE DONE