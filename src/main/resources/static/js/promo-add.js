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
				$("#titulo").val(data.title);
				$("#site").text(data.site.replace("@", ""));
				$("#linkImagem").attr("src", data.image);
			},
			statusCode: {
				404: function(){
					$("#alert").addClass("alert alert-danger").text("Não foi possível obter informações por esta URL.")
				}
			}
		})
	}
})