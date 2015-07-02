//Create iam scopes

iam.createScope('iam:user:me','http://iam.corbel.io', [	mediaTypes : [ 	"application/json" ], 	"methods" : [ "GET", "PUT", "DELETE", "POST" ], 	"type" : "http_access", 	"uri" : "v.*/user/me((/identity)|(/signout)|(/disconnect))?/?", tokenType: "user"])

iam.createScope('iam:user:create','http://iam.corbel.io', [ 	mediaTypes : [ 	"application/json" ], 	"methods" : [ "POST" ],  	"type" : "http_access", 	"uri" : 'v.*/user/?' ] )

iam.createScope('iam:username:availability','http://iam.corbel.io', [	mediaTypes : [ 	"application/json" ], 	"methods" : [ "HEAD" ], 	"type" : "http_access", 	"uri" : "v.*/username/[\\w\\-@.]+"])

iam.createScope('iam:user:profile','http://iam.corbel.io', [	mediaTypes : [ 	"application/json" ], 	"methods" : [ "GET" ], 	"type" : "http_access", 	"uri" : "v.*/user/\\w+/profile/?", tokenType: "user"])

iam.createScope('iam:user:resetpassword','http://iam.corbel.io', [	mediaTypes : [ 	"application/json" ], 	"methods" : [ "GET" ], 	"type" : "http_access", 	"uri" : "v.*/user/resetPassword"])

iam.createScope('iam:user:device','http://iam.corbel.io', [ 	mediaTypes : [ 	"application/json" ], 	"methods" : [ "GET", "PUT", "DELETE" ],  	"type" : "http_access", 	"uri" : 'v.*/user/me/devices(/.*)?' ] )


//Admin

iam.createScope('iam:user:delete','http://iam.corbel.io', [ 	mediaTypes : [ 	"application/json" ], 	"methods" : [ 	"DELETE" ], 	"type" : "http_access", 	"uri" : '(?!v.*/user/me$)v.*/user/.*' ] )

iam.createScope('iam:user:read','http://iam.corbel.io', [	mediaTypes : [ 	"application/json" ], 	"methods" : [ "GET" ], 	"type" : "http_access", "uri" : '(?!v.*/user/me$)(?!v.*/user/me/(identity|profile)$)v.*/user(/\\w+(/(identity|profile))?)?/?' ])

iam.createScope('iam:user:edit','http://iam.corbel.io', 	[	mediaTypes : [ 	"application/json" ], 	"methods" : [ "PUT" ], 	"type" : "http_access", "uri" : 'v.*/user/\\w+' ])

iam.createScope('iam:identity:admin','http://iam.corbel.io',[	mediaTypes : [ 	"application/json" ], 	"methods" : [ "GET", "POST" ], 	"type" : "http_access", "uri" : 'v.*/user/\\w+/identity' ])

iam.createScope('iam:user:disconnect:admin','http://iam.corbel.io', [ 	mediaTypes : [ 	"application/json" ], 	"methods" : [ "PUT" ],  	"type" : "http_access", 	"uri" : '(?!v.*/user/me/disconnect$)v.*/user/\\w+/disconnect' ] )

iam.createScope('iam:user:device:admin','http://iam.corbel.io', [ 	mediaTypes : [ 	"application/json" ], 	"methods" : [ "GET", "PUT", "DELETE" ],  	"type" : "http_access", 	"uri" : 'v.*/user/\\w+/devices(/.*)?' ] )


//Root


iam.createScope('iam:domain:root','http://iam.corbel.io', [ 	mediaTypes : [ 	"application/json" ], 	"methods" : [ "POST", "GET", "PUT", "DELETE" ],  	"type" : "http_access", 	"uri" : 'v.*/domain(/[\\w\\-:@.]+)?/?' ] )
iam.createScope('iam:client:root','http://iam.corbel.io', [ 	mediaTypes : [ 	"application/json" ], 	"methods" : [ "POST", "GET", "PUT", "DELETE" ],  	"type" : "http_access", 	"uri" : 'v.*/domain(/[\\w\\-:@.]+)/client(/[\\w\\-@.]+)?/?' ])
iam.createScope('iam:scope:root', 'http://iam.corbel.io', [ 	mediaTypes : [ 	"application/json" ], 	"methods" : [ "POST", "GET",        "DELETE" ],  	"type" : "http_access", 	"uri" : 'v.*/scope(/[\\w\\-:@.]+)?/?' ] )