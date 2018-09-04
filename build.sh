if [ ${TRAVIS_PULL_REQUEST} = 'false' ] && [[ $TRAVIS_BRANCH = 'master'  ||  ${TRAVIS_BRANCH} = 'develop' ]]; then
    echo 'Checking Quality Gates'
    mvn -B sonar:sonar -Dsonar.projectKey=skokaina_devops -Dsonar.organization=skokaina-github -Dsonar.host.url=https://sonarcloud.io -Dsonar.login=d690e1dc721c02d815ac16c2778afd27dc2f3f19
fi