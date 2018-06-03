<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %> 


   <section>
      <div class="jumbotron">
         <div class="container">
            <h1 class="alert alert-danger"> <spring:message code="productNotFound.text" /> ${invalidProductId}</h1>
         </div>
      </div>
   </section>

   <section>
      <div class="container">
         <p>${url}</p>
         <p>${exception}</p>
      </div>

      <div class="container">
         <p>
            <a href="<spring:url value="/market/products" />" class="btn btn-primary">
               <span class="glyphicon-hand-left glyphicon"></span> <spring:message code="products.label" />
            </a>
         </p>
      </div>
      
   </section>
