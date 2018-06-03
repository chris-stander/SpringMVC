<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>


	<section class="container" ng-app="cartApp">
		<div class="row">
			<div class="col-md-5">
				<img src="<c:url value="/img/${product.productId}.png"></c:url>"
					alt="image" style="width: 100%" />
			</div>

			<div class="col-md-5">
				<h3>${product.name}</h3>
				<p>${product.description}</p>
				<p>
					<strong><spring:message code="products.itemCode.label" /> : </strong><span class="label label-warning">${product.productId}</span>
				</p>
				<p>
					<strong><spring:message code="addProduct.form.manufacturer.label" /></strong> : ${product.manufacturer}
				</p>
				<p>
					<strong><spring:message code="addProduct.form.category.label" /></strong> : ${product.category}
				</p>
				<p>
					<strong><spring:message code="addProduct.form.unitsInStock.label" /></strong> : ${product.unitsInStock}
				</p>
				<h4><spring:message code="currency.label" /> ${product.unitPrice}</h4>
				<p ng-controller="cartCtrl">
					<a href="<spring:url value="/market/products" />"
						class="btn btn-default"> <span
						class="glyphicon-hand-left glyphicon"></span> <spring:message code="button.back" />
					</a> 
                    <a href="#" class="btn btn-warning btn-large" ng-click="addToCart('${product.productId}')"> 
                            <span class="glyphicon-shopping-cart glyphicon"></span> <spring:message code="button.orderNow" />
					</a>
                    <a href="<spring:url value="/cart" />" class="btn btn-default">
                        <span class="glyphicon-hand-right glyphicon"></span> <spring:message code="button.viewCart" />
                    </a>
				</p>
			</div>
		</div>
	</section>
