<%--
  Created by IntelliJ IDEA.
  User: leezarmong
  Date: 23. 3. 16.
  Time: 오후 4:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>

    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>




    <title>$Title$</title>
  </head>
  <body>

  <div>
    <section>
      <div>
        <article>
          <div>
            <h2>ajax 설명 입니다.</h2>
            <dl>
              <dt>성명</dt>
              <dd>
                <input type="text"  id="name" value="리자드"/>
              </dd>
            </dl>
            <dl>
              <dt>성별</dt>
              <dd>
                <input type="text"  id="sex" value="남자"/>
              </dd>
            </dl>
            <dl>
              <dt>나이</dt>
              <dd>
                <input type="text"  id="age" value="20"/>
              </dd>
            </dl>
            <dl>
              <dt>전화번호</dt>
              <dd>
                <input type="text"  id="tell" value="010-0000-0000"/>
              </dd>
            </dl>
            <dl>
              <dd>
                <input type="button" id="request" value="제출"/>
              </dd>
            </dl>
            <br>

          </div>
        </article>
      </div>
    </section>
  </div>

  <script>


    // 'request'라는 id를 가진 버튼 클릭 시 실행.
    $("#request").click(function(){

      // json 형식으로 데이터 set
      var params = {
        name      : $("#name").val()
        , sex       : $("#sex").val()
        , age       : $("#age").val()
        , tell    : $("#tell").val()
      }

      // ajax 통신
      $.ajax({
        type : "GET",            // HTTP method type(GET, POST) 형식이다.
        url : "/test",      // 컨트롤러에서 대기중인 URL 주소.
        data : params         // Json 형식의 사용 될 데이터
      });
    });

  </script>
  </body>

</html>
