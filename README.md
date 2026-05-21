# Decision-Making Support for Security Architecture Design Decisions

This repository is organized as follow :
- [Decision_Making_Support](./Decision_Making_Support/]) folder contains two files providing how we expect the tool to handle the strategies:

  - The jupyter notebook presenting the scenario with the strategies applied for the decision-making support : [Decision_making_resolution](./Decision_Making_Support.ipynb)

  - An example of results from the first Decision-making process: [Decision-Making process results](./DM_Process_Options_Selected.csv)

- [xtext](./xtext/) folder contains the domain specific languages ([decisionmaking](./xtext/decisionmaking.parent/),[sadd](./sadd.parent/),[teamprofile](./xtext/teamprofile.parent/)) and the [SCADA](./xtext/SCADA/) folder containing instantiation files of our xtext to define the concepts we need and use in our SCADA use case scenario.
- The grammar of each DSL can be found in the xtext file of each main project :
  - [Decision Making Xtext](./xtext/decisionmaking.parent/decisionmaking/src/xtext/Decisionmaking.xtext)
  - [Security Architectural Design Decisions Xtext](./xtext/sadd.parent/sadd/src/xtext/Sadd.xtext)
  - [Team Profile Xtext](xtext/teamprofile.parent/teamprofile/src/xtext/Teamprofile.xtext)

## Xtext Installation Guide
### Installation requirements
- Eclipse MDT 2024-06
- Java 21 Open JDK
- Maven 3.9+
### Importing projects
You can launch your Eclipse MDT and import the `decisionmaking.parent`, `sadd.parent`, `teamprofile.parent` projects.

### Generating artifacts 
Go to `teamprofile.parent > src > teamprofile` and right click on `GenerateTeamprofile.mwe2 > Run as.. > MWE2 Workflow`.
You then need to do the same procedure for `sadd.parent` and `decisionmaking.parent`.
:warning: Make sure to do it in this order as they depend on each other in the given order.
### Lauching the Runtime Eclipse Application
After doing so you can then launch an Eclipse Application by right clicking on `decisionmaking.parent >  src > teamprofile > TeamprofileRuntimeModule.java` and selecting `Run as... > Eclipse Application`.
### Importing Example folder
You will then be able to import the SCADA folder containing file examples for each of the DSLs defined.
`File > Open Projects from file system > Directory > SCADA`.

### Creating new files
To create new files you will need to select `File > New File` and give a name with the extension matching the DSL :
- `.tp`
- `.sadd`
- `.dm`