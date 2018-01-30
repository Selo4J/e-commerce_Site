# e-commerce_Site Template
An Online Retail Management, Custommer Order Processing System and Admin Stock Managment using NetBeans IDE with Java, Spring MVC Spring Data JPA, JPS, EJB, MySQL, Bootstrap and XML Configuration

# E-Shopper Framework
An Online Retail Management, Custommer Order Processing System and Admin Stock Managment 
##### -By Selomon Goitom email: selomongoitom@gmail.com

Follow the documentation 

For detailed setup instructions, see:  http://netbeans.org/kb/docs/javaee/ecommerce/setup.html

The following is a course-grained summary of setup steps and requirements.

The E-Shooper application requires access to a MySQL database.

Before running the application,

 1. Download MySQL from: http://dev.mysql.com/downloads/

    The database server configuration uses 'root' / '' as the default username / password.
    Because GlassFish sometimes doesn't accept an empty password when creating a connection
    pool*, the E-Shooper project requires that you set the server 
    username to: 'SoloCoding' or 'root'
    password to: ''. 

    You can set the password from a command-line prompt. To set your password to '', 
    navigate to your MySQL installation's 'bin' directory in the command-line prompt and
    enter the following:

        shell> mysql -u root
        mysql> UPDATE mysql.user SET Password = PASSWORD('') WHERE User = 'root' or 'SoloCoding';
        mysql> FLUSH PRIVILEGES;

    *See GlassFish Issue 12221:  https://glassfish.dev.java.net/issues/show_bug.cgi?id=12221

 2. From the IDE's Services window, right-click the MySQL Server node and choose Create Database.

 3. In the Create Database dialog, type in 'eshopstore' and select the 'Grant Full Access
    To *@localhost' option.

 4. Click OK to exit the dialog.

 5. Run the SQL scripts found in this directory. The eshopstore_schema script creates tables
    necessary for the application. The eshopstore_schema script also contains sample data to the
    tables. Run the schema creation script first, then run the sample data script. To run scripts:

    a. Double-click each script node to open them in the IDE's editor.
    b. In the toolbar above the editor, make sure the connection to the
       'eshopstore' database is selected:

        jdbc:mysql://localhost:3306/eshopstore

    c. Click the Run SQL button to run the script.

 6. It is necessary to enable automatic driver deployment on the server. This is because the
    GlassFish server doesn't contain the MySQL driver. Choose Tools > Servers, and select the
    GlassFish server in the left pane. Then in the right pane, select the 'Enable JDBC Driver
    Deployment' option. (The option is enabled by default.)

    After making this change, you'll need to restart the server (if it's already running).


Notes:

    - The glassfish-resources.xml file creates the 'jdbc/eshopper' data source, and 'eshopperPool'
      connection pool on the server when the application is deployed.

    - The server may need to be restarted for the data source and connection pool settings to take
      effect.

    - The application uses EclipseLink as the persistence provider, and was developed using NetBeans
      6.8 and 6.9 with GlassFish 4.


Following When running the application
 
### USER LOGIN Account or you could also create your own by registering in Register Page. 
* username: selo
* password: pass

### ADMIN LOGIN Management

Note that Adimn account has been set in GlassFish Server. so you follow this tutorial https://docs.appdynamics.com/display/PRO41/Administrative+Users

* username: eshopper
* password: pass


### Features 
* A full fledged online retail website system using java technologies
* Frontend supported with Bootstrap 3 + 
* Images used as resources only when they are in a real need _For Eg. A product informational purpose_
* Product image gallery for both the usecases client/admin
* Quick dashboard views,
* Dashboard consists of online managment
	* View order lists 
	* Customer Lists
	* Product Management: to add/edit/delete prodcut 
	* Category Management: to add/edit/delete category 
	* Subcategory Management: to add/edit/delete Subcategory 
	* Upload Image: to upload product's image.


	
### Guide to installing E-Shopper Framework into your machine
Prerequisites - Must be having on the client computer before installation

* A copy of JDK/JRE + Netbeans 8.2 +
	http://netbeans.org/downloads/
	
* A built in or external container like GlassFish Server 4.1.1 +
	
* MySQL Database with the same name as the project, (Use an Xampp) or DB Derby in Netbeans 8.2 +
* Given the MySQL File (.sql) Under setup directory of project root, Import the file into your database and you have your tables ready

* Configuring Apache Server along with MySQL will be probably s system like mine for using phpMyAdmin
* _Install XAMPP/WAMPP as per the the above two steps if dont need to install manually_
	http://www.apachefriends.org/en/xampp.html
* Try to change the username and passwords as per your database users for both of the file eshopper in packages database and cart respectively 
	
* Clean the project, Build the project and deploy it into the container
* Resolve the referencing problems if any by adding the project GlassFish_Server
* Run your project copy
* Custommize the products and users as per your requirement
* Done


### The project is developed, distributed and is made available for free,
### I will not be responsible for any loss or damage whatsoever caused resulting into usage of this product, to whomsoever it may concern.
