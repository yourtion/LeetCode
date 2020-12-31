/**
 * @param {string} s
 * @param {set<string>} wordDict
 *   Note: wordDict is a Set object, see:
 *   https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Set
 * @return {boolean}
 */
var wordBreak = function(s, wordDict) {
	var index_set = {};
	var res = s;
	wordDict.forEach(function(value) {
		var key = new RegExp(value,"g");
		res = res.replace(key, "")
		if(s.indexOf(value) != -1){
			index_set[value]=s.indexOf(value);
		}
	});
	if (res==="") return true
	var all_value = [];
	var all_length = [];
	for (var key in index_set) {
		if (index_set.hasOwnProperty(key)) {
			all_value.push(index_set[key])
			all_length.push(key.length)
		}
	}

	var str_length = s.length;
	console.log(str_length,all_length,all_value)
	var get_zero = 0;
	for (var i = 0; i < all_value.length; i++) {

		if(all_length.indexOf(all_value[i]+all_length[i]) !== -1){
			str_length = str_length - all_length[i]
			if(all_value[i]===0) {
				
				if(get_zero>0) {
					str_length = str_length + (get_zero-all_length[i])
				}
				get_zero = all_length[i] > get_zero ?   all_length[i]  : get_zero
			}
			
		}
		if(all_length[i]+all_value[i] === str_length) {
			str_length = str_length-all_length[i]
			all_value.splice(i, 1);
			all_length.splice(i, 1);
			console.log("ssssss")
		}

	}
	console.log(str_length)
	return str_length <=0
};


function Test(){
	var test_case = [
//		[["leetcode",["leet", "code"]], true]
//		, [["bb",["a","b","bbb","bbbb"]], true]
//		, [["cars",["car","ca","rs"]] ,true]
//		, [["carsap",["car","rsap","ca","ap"]] ,true]
//		, [["carscarap",["car","ca","rsap","ap"]] ,false]
//		, [["goalspecial",["go","goal","goals","special"]] ,true]
//		, [["dcacbcadcad",["cbd","dca","bcdc","dcac","ad"]] ,false]
		, [["bccdbacdbdacddabbaaaadababadad",["cbc","bcda","adb","ddca","bad","bbb","dad","dac","ba","aa","bd","abab","bb","dbda","cb","caccc","d","dd","aadb","cc","b","bcc","bcd","cd","cbca","bbd","ddd","dabb","ab","acd","a","bbcc","cdcbd","cada","dbca","ac","abacd","cba","cdb","dbac","aada","cdcda","cdc","dbc","dbcb","bdb","ddbdd","cadaa","ddbc","babb"]] ,true]
		]
	var count = 0
	test_case.forEach(function (test, i) {
		var res = wordBreak(test[0][0],new Set(test[0][1]))
		if (res == test[1]){
			count ++;
			// console.log("->" + test[0] + "Done");
		}else {
			console.log("!!! `" + test[0] + "` expext : `" + test[1] + "` get : `" + res + "`");
		}
	}) 
	console.log("Test : " + count + "/" + test_case.length)
}

Test()