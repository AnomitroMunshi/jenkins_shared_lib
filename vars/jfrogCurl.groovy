def call(String jarPath, String serverUrl, String repoName) {
    // Retrieve JFrog credentials from Jenkins credentials store
    def credentials = credentials('jfrogArtifactory')

    // Construct the curl command with retrieved credentials and parameters
    def curlCommand = "curl -X PUT -u ${credentials.username}:${credentials.password} -T $jarPath $serverUrl/artifactory/$repoName/"

    // Execute the curl command
    sh curlCommand
}
