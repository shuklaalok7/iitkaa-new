<!doctype html>
<%@taglib prefix="s" uri="/struts-tags" %>

<html lang="en">
<head>
    <jsp:include page="includables/common_css.jsp" />
</head>
<body>
<jsp:include page="includables/header.jsp"/>
<div class="container">
    <form class="login-form form-horizontal" action="/checkLogin" method="post">
        <div class="form-group">
            <label for="inputUsername" class="col-sm-2 control-label">Username</label>
            <div class="col-sm-10">
                <input type="text" name="username" class="form-control" id="inputUsername" placeholder="Username" required>
            </div>
        </div>

        <div class="form-group">
            <label for="inputPassword" class="col-sm-2 control-label">Password</label>
            <div class="col-sm-10">
                <input type="password" name="password" class="form-control" id="inputPassword" placeholder="Password" required>
            </div>
        </div>

        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
                <div class="checkbox">
                    <label>
                        <input name="rememberMe" value="true" type="checkbox"> Remember me
                    </label>
                </div>
            </div>
        </div>

        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
                <button type="submit" class="btn btn-primary">Login</button>
                <button type="reset" class="btn btn-link">Forgot password?</button>
            </div>
        </div>
    </form>
    <jsp:include page="includables/footer.jsp" />
</div>
</body>
</html>
