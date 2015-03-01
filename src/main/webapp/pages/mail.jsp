<!doctype html>
<%@taglib prefix="s" uri="/struts-tags" %>

<html lang="en">
<head>
    <jsp:include page="includables/common_css.jsp" />
</head>
<body>
<jsp:include page="includables/header.jsp"/>
<div class="container">
    <form class="form-horizontal" action="/send" method="post">
        <div class="form-group">
            <label for="inputSubject" class="col-sm-2 control-label">Subject</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="inputSubject" placeholder="Subject" required>
            </div>
        </div>
        <div class="form-group">
            <label for="inputBody" class="col-sm-2 control-label">Message</label>
            <div class="col-sm-10">
                <textarea class="form-control" id="inputBody" placeholder="Message" rows="5" required></textarea>
            </div>
        </div>

        <div class="form-group">
            <label for="inputAttachment" class="col-sm-2 control-label">Attachment</label>
            <div class="col-sm-10">
                <input type="file" name="attachment" class="form-control" id="inputAttachment" placeholder="File">
            </div>
        </div>

        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
                <button type="submit" class="btn btn-primary">Submit</button>
                <button type="reset" class="btn btn-default">Cancel</button>
            </div>
        </div>
    </form>

    <jsp:include page="includables/footer.jsp" />
</div>
</body>
</html>
