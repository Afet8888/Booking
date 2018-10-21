var getAll =  function() {
    var url = 'http://localhost:8080/advertisement/getAllAdvertisements';
    var a = {};
    a.limit = 5;
    a.page = 1;
    console.log(JSON.stringify(a));
    $.ajax({
        type: "POST",
        url: url,
        data: JSON.stringify(a),
        success: function (data) {
            //console.log(JSON.parse(data));
        },
        dataType: 'json',
        contentType: 'application/json',
    });
}