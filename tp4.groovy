node {
    stage('first'){
        print "Hello from Github"
        sh 'env'
    }
    stage ('second'){
        print 'Seconf stage'
    }
    stage ('print variable'){
        print 'build number : $BUILD_NUMBER'
    }
}
