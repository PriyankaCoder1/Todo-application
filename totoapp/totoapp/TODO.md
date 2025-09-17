# TODO List for Totoapp

## Completed Tasks
- [x] Fixed Task.java entity: Added @Entity, @Table(name="tasks"), @Id, @GeneratedValue, fields with @Column, used Lombok @Data for getters/setters.
- [x] Verified Taskrepository.java: Already extends JpaRepository<Task, Long>.
- [x] Added H2 database dependency to pom.xml.
- [x] Changed application.properties to use H2 in-memory database instead of MySQL to avoid connection issues.
- [x] App should now run without errors, creating the tasks table automatically.

## Pending Tasks
- [ ] Test the web interface at http://localhost:8081/ to add, delete, and toggle tasks.
- [ ] If needed, switch back to MySQL by updating application.properties and ensuring MySQL is running with correct credentials.
