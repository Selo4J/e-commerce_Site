# e-commerce_Site Template
An Online Retail Management, Custommer Order Processing System and Admin Stock Managment using NetBeans IDE with Java, Spring MVC Spring Data JPA, JPS, EJB, MySQL, Bootstrap and XML Configuration

# E-Shopper Framework
An Online Retail Management, Custommer Order Processing System and Admin Stock Managment 
##### -By Selomon Goitom email: selomongoitom@gmail.com or tomsol28@yahoo.co.uk

# What you will build

### Welcome page
The welcome page is the site's home page, it is an entry point for the application. It introduces the business and service to the user. It also allows the user to navigate to any of the products subcategories and categories.

<img width="357" alt="image" src="https://user-images.githubusercontent.com/28166699/41017133-706299ea-694b-11e8-903e-3e7dfcf9eb50.png">

### Grid view page: 
Grid view page provides a listing of products. In this case, a user is able to view the product details by clicking "Quick view".

<img width="355" alt="image" src="https://user-images.githubusercontent.com/28166699/41017645-ba736ae4-694d-11e8-9b9d-1810ba5c480f.png">
 
### Item View with Related Product page:
The item page displays a single view of selected item. It also provides related products based on the selected item. From this page, the user is capable to add the selected product or from the "Related Products" to his or her shopping cart. 
 
<img width="295" alt="image" src="https://user-images.githubusercontent.com/28166699/41017671-d7197e22-694d-11e8-97a0-49748e1b8902.png">

### Category page
The category page provides a listing of all products within selected category.  As a result, the user is able to view all product information, and add any of the listed items to her or his shopping cart. A user can also navigate to any of the provided categories.

<img width="275" alt="image" src="https://user-images.githubusercontent.com/28166699/41017159-912897ec-694b-11e8-9533-6a4cdad1472f.png">
 
### Subcategory page 
The subcategory page provides a listing of all products within selected category.  As a result, the user is able to view all product information, and add any of the listed items to her or his shopping cart. A user can also navigate to any of the provided subcategories.

<img width="276" alt="image" src="https://user-images.githubusercontent.com/28166699/41017172-9ba69408-694b-11e8-91b9-d957d2e9da8c.png">

### Cart page
The cart page lists all products held in the user's shopping cart. It shows item information for each product, and calculates the subtotal for items in cart. From this page, a use can:
"	Update the quantity for any listed product.
"	Clear all items in her or his shopping cart.
"	Return to the previous subcategory or category by clicking continue shopping.
"	Proceed to checkout.

<img width="340" alt="image" src="https://user-images.githubusercontent.com/28166699/41017181-a3eaa97e-694b-11e8-8276-74a2fc252059.png">

### Checkout page
The checkout page collects information from the customer using form. This page also shows purchase conditions, and summarizes the order by providing calculations for the total cost.

<img width="326" alt="image" src="https://user-images.githubusercontent.com/28166699/41017192-b06ff636-694b-11e8-8aac-b7124b053295.png">

### Confirmation page
The confirmation page returns a message to the customer confirming that the order was successfully recorded. It also provides an order reference number is provided to the customer, as well a summary listing order details.

<img width="304" alt="image" src="https://user-images.githubusercontent.com/28166699/41017199-bb550ece-694b-11e8-8e47-fc047dd903e4.png">
 
### Contact us page
The contact us page collects any comments from customer, if the customer seeks any help or service regarding his or her order information.  
 
### User welcome page:
User welcome page is the site's customer home page, and after the customer has been accesses successfully.  From this page, it shows login username with logout functionality.
   
### Customer Login Page:
The customer login page provides customer login form, and it authenticates customer's information if the customer does exist in system.

<img width="341" alt="image" src="https://user-images.githubusercontent.com/28166699/41017220-db07e69c-694b-11e8-902f-a2c8789a8c5b.png">

 
### Customer registration page
The customer registration page collects signup information from customer using form. This also displays a link login page.

<img width="356" alt="image" src="https://user-images.githubusercontent.com/28166699/41017225-e45ab044-694b-11e8-904b-d939d051a129.png">

 
### Admin login page
The admin login page provides admin login form, and validates the information that has been entered the data input.

<img width="311" alt="image" src="https://user-images.githubusercontent.com/28166699/41017590-76c2152a-694d-11e8-8cad-4be2fbe7fd8b.png">

 
### Admin Stock Management page:
The admin management page lists all order details, and handles to add/edit/delete product details. It also handles both category and subcategory to add/edit /delete in the system.

<img width="334" alt="image" src="https://user-images.githubusercontent.com/28166699/41017613-9090c640-694d-11e8-9b6b-a56f17edb067.png">

<img width="267" alt="image" src="https://user-images.githubusercontent.com/28166699/41017631-a0ae2a36-694d-11e8-974c-352fd96626c3.png">

This post walks you through the process of creating an e-commerce site, installing and setting up the tooling components and technologies.

# Follow the documentation 

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
