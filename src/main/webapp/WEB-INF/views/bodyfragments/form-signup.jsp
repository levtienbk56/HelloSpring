<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<style>
footer {
	position: absolute;
	right: 0;
	bottom: 0;
	left: 0;
	padding: 1rem;
	background-color: #efefef;
	text-align: center;
}

#mainNav {
	background-color: black;
}

.form-login {
	margin-top: 120px;
}

.text-error{
	color: red;
	font-style: italic;
}
</style>

<div class="container form-login">
	<div class="row">
		<div class="col-lg-3"></div>
		<div class="col-lg-6">
			<h3>新ユーザーを登録する</h3>
		</div>
	</div>
	<div class="row">
		<div class="col-lg-3"></div>
		<div class="col-lg-6">
			<form:form modelAttribute="customer" action="/HelloSpring/form/validate"
				method="post">
				<div class="form-group">
					<form:label path="username">ユーザー名</form:label>
					<form:input path="username" type="text" class="form-control"
						id="username" />
					<form:errors path="username" class="text-error" />
				</div>
				<div class="form-group">
					<form:label path="email">メールアドレス</form:label>
					<form:input path="email" type="text" class="form-control"
						id="email" />
					<form:errors path="email" class="text-error"/>
				</div>

				<form:button name="submit" type="submit"
					class="btn btn-success text-center">登録する</form:button>
			</form:form>
		</div>
		<div class="col-lg-2"></div>
	</div>
	<div class="row text-center"></div>
</div>

<!-- Custom JavaScript -->
<script src="/HelloSpring/resources/js/form_signup.js"></script>