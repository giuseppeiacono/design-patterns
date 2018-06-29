# Design Patterns

## Project overview
This repository has the main goal to provide just what you need to understand how work a DESIGN PATTERN 
and if it could be a candidate for the solution you want to provide.

This repo consists of one project per design pattern. 
Each of them provides:
+ the implementation of pattern 
+ tests 
+ README file that resumes the most important details of current pattern:
    - Overview: applicability of pattern
    - Pattern info: definition, new OO principles, class diagram and observations
    - Pattern implementation: details of implementation proposed in the current project and real implementation examples like Java classes
    
### Object Oriented principles
The design patterns proposed in this project are based on various OO principles.
All of them take into account the following base principles:
1. Encapsulate what varies
2. Favor composition over inheritance
3. Program to interface, not to implementations

I don't provide any details about principles above because they are well documented on several web pages, showing definitions, diagrams and real examples.

On each sub-project you can find new OO principles followed by pattern.

## Technical Details

### Sub-project generation
Each sub-project was generated with the following command:
```
mvn archetype:generate -DgroupId=com.pippo -DartifactId=design_pattern_name -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
```