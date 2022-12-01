# DevOps Technical Assessment

Skills required:
- GNU/Linux Advanced Administration
- Proficiency in: Python, Java, Go, Ruby or Node (any of these programming languages)
- Advanced GIT knowledge- CI/CD pipelines knowledge is a must. (Any on-premise or cloud platform)
- Use of IaC (Infrastructure as Code) (With any desired provider)
- Kubernetes Administration
- Docker Administration

Desirable Skills:
- Cloud Computing administration ( Microsoft Azure, Amazon AWS, Google Cloud Platform, etc.)
DevOps Exercise
Rules and requirements
- There is no internet usage limit
- All generated code must be versioned using a public GitHub Repo created by the candidate

You must comply with the following requirements:
- The microservice must be containerized and can be deployed on any machine.
- It is required to use a load balancer with a minimum of two nodes with the same microservice.
- The infrastructure code must be versionated.
- The pipeline should be configured as a code and needs to be stored in a repository.

Minimum requirements for the pipeline:

- Use of Dependency Management
- It should have two stages at minimum: “build” and “test”, and can have the stages that you want.
- Must be automatic and can be executed by any branch, the master branch always deploys to the
  production environment. If it is required you can create more environments: development or
  testing. Additionally you could execute the pipeline on demand and you can deploy any version of
  the microservice (In the case that more than one version exists)
- The pipeline should be configured as a code and needs to be stored in a repository
