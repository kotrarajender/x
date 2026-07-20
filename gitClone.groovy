def call(string branch, string credentialsId,String url){
  git branch: branch, credentialsId: credentialsId, url: url
}
