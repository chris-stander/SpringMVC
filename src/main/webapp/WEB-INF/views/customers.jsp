<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
   href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
<title><spring:message code="addCustomer.form.heading.label" /></title>
</head>
<body>
   <section>
      <div class="jumbotron">
         <div class="container">
            <h1><spring:message code="addCustomer.form.heading.label" /></h1>
            <p><spring:message code="addCustomer.form.allCustomers.label" /></p>
         </div>
      </div>
   </section>

   <section class="container">
      <table class="table table-hover">
            <tr>
               <th><spring:message code="addCustomer.form.customerId.label" /></th>
               <th><spring:message code="addCustomer.form.name.label" /></th>
               <th><spring:message code="addCustomer.form.address.label" /></th>
               <th><spring:message code="addCustomer.form.noOfOrders.label" /></th>
                <th><spring:message code="cart.action.label" /></th>
            </tr>
            <tr ng-repeat="customer in customers">
               <td>{{customer.customerId}}</td>
               <td>{{customer.name}}</td>
               <td>{{customer.address}}</td>
               <td>{{item.noOrOrders}}</td>
               <td><a href="#" class="label label-danger"> <span
                     class="glyphicon glyphicon-remove" ></span> <spring:message code="cart.remove.label" />
               </a></td>
            </tr>
       </table>
   </section>
</body>
</html>
