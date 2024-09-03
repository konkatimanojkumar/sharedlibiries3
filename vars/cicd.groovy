def gitdownload(repo)
{
   git "https://github.com/konkatimanojkumar/${repo}.git"
}
def gitbuild()
{
  sh 'mvn package'
}
