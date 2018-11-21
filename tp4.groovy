def my_variable="Loic à faim"

node {
    stage('first'){
        print "Hello from Github"
        sh 'env'
    }
    stage ('second'){
        print 'Seconf stage'
    }
    stage ('print variable'){
        sh 'echo build number : $BUILD_NUMBER'
    }
    stage ('Loic'){
        print 'Pourquoi '+ my_variable + ' ?'
}
