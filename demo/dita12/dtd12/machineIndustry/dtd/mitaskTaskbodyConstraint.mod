<?xml version="1.0" encoding="UTF-8"?>
<!-- ============================================================= -->
<!--                    HEADER                                     -->
<!-- ============================================================= -->
<!--  MODULE:    DITA Machine Industry Taskbody Constraint         -->
<!--  VERSION:   1.2                                               -->
<!--  DATE:      April 2008                                        -->
<!--                                                               -->
<!-- ============================================================= -->

<!-- ============================================================= -->
<!--                    PUBLIC DOCUMENT TYPE DEFINITION            -->
<!--                    TYPICAL INVOCATION                         -->
<!--                                                               -->
<!--  Refer to this file by the following public identifier or an 
      appropriate system identifier 
PUBLIC "-//OASIS//ELEMENTS DITA Machine Industry Task Constraint//EN"
      Delivered as file "mitaskTaskConstraint.mod"                 -->

<!-- ============================================================= -->
<!-- SYSTEM:     Darwin Information Typing Architecture (DITA)     -->
<!--                                                               -->
<!-- PURPOSE:    Declaring the domain entity for the strict task   -->
<!--             constraint module                                 -->
<!--                                                               -->
<!-- ORIGINAL CREATION DATE:                                       -->
<!--             April 2008                                        -->
<!--                                                               -->
<!--             (C) Copyright OASIS Open 2008                     -->
<!--             All Rights Reserved.                              -->
<!--                                                               -->
<!--  UPDATES:                                                     -->
<!-- ============================================================= -->


<!-- ============================================================= -->
<!--                    Machine Industry Taskbody ENTITIES         -->
<!-- ============================================================= -->

<!ENTITY taskbody-constraints     
  "(topic task mitaskTaskbody-c)"
>

<!ENTITY % prelreqs        "prelreqs">
<!ENTITY % context         "context">
<!ENTITY % section         "section">
<!ENTITY % steps           "steps">
<!ENTITY % steps-unordered "steps-unordered">
<!ENTITY % process         "process">
<!ENTITY % result          "result">
<!ENTITY % example         "example">
<!ENTITY % closereqs       "closereqs">

<!ENTITY % taskbody.content
              "(((%prelreqs;) | 
                 (%context;) |
                 (%section;))*,
                ((%steps; | 
                  %steps-unordered; |
                  %process;))?, 
                (%result;)?, 
                (%example;)*, 
                (%closereqs;)?)"
               >

<!-- ================== End Machinery Taskbody Entities ========== -->