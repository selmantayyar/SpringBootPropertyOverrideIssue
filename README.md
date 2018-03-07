# SpringBootPropertyOverrideIssue
Respository to showcase Spring Boot Issue when overriding property in YAML files.
Very simple project to proof the issue with Spring Boot 1.5.10. 
A property in application.yml file can not be overriden in a test yml file. It works OK with .properties file.

Please run ConfigurationServiceTest to reproduce the issue.
