$("#linkPromocao").on('change', function(){
	var url = $(this).val();
	//TODO criar um filtro melhor de request para URLs.
	if(url.length > 7) {
		$.ajax({
			method:"POST",
			url: "/meta/info?url=" + url,
			cache: false,
			success: function(data){
				console.log(data);
			}
		})
	}
})