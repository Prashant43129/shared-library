def download(file)
{
   git "https://github.com/intelliqittrainings/${file}"
}
def build()
{
   sh "mvn package"
}
def deploy(job,ip,appname)
{
   sh "scp /var/lib/jenkins/workspace/${jobname}/webapp/target/webapp.war ubuntu@${ip}:/var/lib/tomcat9/webapps/${appname}.war"
}
def testing(file)
{
   git "https://github.com/intelliqittrainings/${file}"
}
def delivery(job,ip,appname)
{
   sh "scp /var/lib/jenkins/workspace/${jobname}/webapp/target/webapp.war ubuntu@${ip}:/var/lib/tomcat9/webapps/${appname}.war"
}
