if [ ${TRAVIS_PULL_REQUEST} = 'false' ] && [[ $TRAVIS_BRANCH = 'master'  ||  ${TRAVIS_BRANCH} = 'develop' ]]; then
    echo 'Checking Quality Gates'
    mvn -B clean verify sonar:sonar  -Dsonar.host.url=https://sonarcloud.io -Dsonar.projectKey=skokaina_devops -Dsonar.organization=skokaina-github -Dsonar.login=d690e1dc721c02d815ac16c2778afd27dc2f3f19;
elif [ ${TRAVIS_PULL_REQUEST} != 'false' ]; then
    echo 'Build and analyze pull request'
    mvn -B clean verify sonar:sonar -Dsonar.host.url=https://sonarcloud.io -Dsonar.projectKey=skokaina_devops -Dsonar.organization=skokaina-github -Dsonar.login=d690e1dc721c02d815ac16c2778afd27dc2f3f19 -Dsonar.github.oauth=8f65232cf6a6b66ee03ead0a87eae8c0eb84b024 -Dsonar.pullrequest.github.repository=skokaina/devops -Dsonar.pullrequest.provider=GitHub -Dsonar.pullrequest.branch=${TRAVIS_BRANCH} -Dsonar.pullrequest.key=${TRAVIS_PULL_REQUEST};
fi