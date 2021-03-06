  dependencies {
      val springVersion = "5.2.5.RELEASE"
      val hibernateVersion : String by project

      compile("org.hibernate:hibernate-ehcache:$hibernateVersion")
      compile("org.hibernate:hibernate-entitymanager:$hibernateVersion")
      compile("org.springframework:spring-context:$springVersion")
      compile("org.springframework:spring-orm:$springVersion")
 }
