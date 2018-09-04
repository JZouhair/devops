if [ ${TRAVIS_PULL_REQUEST} = 'false' ] && [[ $TRAVIS_BRANCH = 'master'  ||  ${TRAVIS_BRANCH} = 'develop' ]]; then
    echo 'Checking Quality Gates'
    mvn -B clean verify sonar:sonar -Dsonar.projectKey=skokaina_devops -Dsonar.organization=skokaina-github -Dsonar.host.url=https://sonarcloud.io -Dsonar.login=d690e1dc721c02d815ac16c2778afd27dc2f3f19
elif [ ${TRAVIS_PULL_REQUEST} != 'false' ]; then
    echo 'Build and analyze pull request'
    mvn -B clean verify sonar:sonar -Dsonar.analysis.mode=issues -Dsonar.host.url=https://sonarcloud.io -Dsonar.login=d690e1dc721c02d815ac16c2778afd27dc2f3f19 -Dsonar.organization=skokaina-github -Dsonar.github.oauth=11aab5c45149101779ff70c2bd4e320b09db5d39 -Dsonar.github.repository=skokaina/devops -Dsonar.github.pullRequest=${TRAVIS_PULL_REQUEST};
fi