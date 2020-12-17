let main = {
	init : function () {
		let _this = this;

		$('#build').on('change', function () {
			_this.getCost();
		});

		$('#capital').on('change', function () {
			_this.getCost();
		});

	},
	getCost : function () {

		let capitalId = $('#capital option:selected').val();
		let buidId = $('#build option:selected').val();

		$( "#result" ).empty();

		$.get("cost?capitalId=" + capitalId + "&buildId=" + buidId, function( data ) {
			let rand = data.rand;
			let billaSum = rand + data.billa;
			let billdingSum = billaSum + data.billding;
			let hotelSum = billdingSum + data.hotel;
			let landmark = hotelSum + data.landmark;
			let parasolSum = rand + data.parasol;
			let banggalo = parasolSum + data.bangalo;

			if (data.parasol > 0) {
				$( "#result" ).append("<h3>파라솔 :  " +  parasolSum + "</h3>");
				$( "#result" ).append("<h3>방갈로 :  " +  banggalo + "</h3>");
			} else {
				$( "#result" ).append("<h3>빌라 :  " +  billaSum + "</h3>");
				$( "#result" ).append("<h3>빌딩 :  " +  billdingSum + "</h3>");
				$( "#result" ).append("<h3>호텔 :  " +  hotelSum + "</h3>");
				$( "#result" ).append("<h3>랜드마크 :  " +  landmark + "</h3>");
			}
		}, "json");
	}
};

main.init();


