var def_callback = function (d) {
    console.log(d);
}

var getAll =  function() {
    var url = urls.getAllAdvertisementsByFilterUrl;
    var searchDto = buildSearchDto();
    console.log(JSON.stringify(searchDto));
    utility.post(url,searchDto,def_callback);
}

var getCities = function () {
    var url = urls.getAllCitiesUrl;
    utility.get(url,city_callback);
}

var city_callback = function (d) {
    var list =d;
    var s = '';
    list.forEach(function (city) {
        s= s.concat('<p>'+city.name+'</p>\n');
    })
    console.log(s);
    $('body').append(s);
}


var buildSearchDto = function () {
    var searchDto = {};
    searchDto.limit = 2;
    searchDto.page = 1;
    return searchDto;
}



