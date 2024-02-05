
#### Comando para criar o projeto via maven
```
mvn archetype:generate                      \
   "-DarchetypeGroupId=io.cucumber"           \
   "-DarchetypeArtifactId=cucumber-archetype" \
   "-DarchetypeVersion=7.15.0"               \
   "-DgroupId=com.franca"                  \
   "-DartifactId=java-automate-runner"               \
   "-Dpackage=runner"                  \
   "-Dversion=1.0.0-SNAPSHOT"                 \
   "-DinteractiveMode=false"

```