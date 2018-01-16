
    $.ajax({
        url: "codeList/list",
        type: "post",
        dataType: "json",
        success: function (data) {
            var row = data.list;
            var str = "";
            $.each(row, function (index, n) {
                //生成随机数
                var x = 1000;
                var y = 0;
                var rand = parseInt(Math.random() * (x - y + 1) + y);
                //获取后台数据
                var title = row[index].title;
                var time = row[index].time.substr(0,16).replace("T","  ");
                var tag= row[index].language;
                var con = row[index].connet.replace(/[^\u4e00-\u9fa5]/gi, " ").substring(0, 50);
                var connet = con + "......";
                var text = "<div class='article shadow'><div class='article-left'>" +
                    "<img src='../images/cover/201703181909057125.jpg' alt='" + title + "' /></div>" +
                    "<div class='article-right'><div class='article-title'><a href='detail.html'>" + title
                    + "</a></div><div class='article-abstract'>" + connet + "</div></div><div class='clear'>" +
                    "</div><div class='article-footer'><span><i class='fa fa-clock-o'>" +
                    "</i>&nbsp;&nbsp;"+time+"</span><span class='article-author'>" +
                    "<i class='fa fa-user'></i>&nbsp;&nbsp;Anonym</span><span>" +
                    "<i class='fa fa-tag'></i>&nbsp;&nbsp;<a href='#'>"+tag+"</a></span>" +
                    "<span class='article-viewinfo'><i class='fa fa-eye'></i>&nbsp;"+rand+"</span>" +
                    "<span class='article-viewinfo'><i class='fa fa-commenting'></i>&nbsp;"+rand+"</span></div></div>";


                str = str + text;
            });

            $("#div").html(str);

        }

    })

