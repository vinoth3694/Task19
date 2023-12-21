
	Elements on Guvi Register web page

	1. Guvi Logo (clicking on this navigates to home page)

		Linktext: GUVI logo
		xpath: //img[@alt='GUVI logo']
		
	2. Sign-up with Google (Navigates to sigh in with google account)
			
			id		: google-button - worked
			
			xpath	: 	//a[@id='google-button']
						//a[@class='btn btn-outline-google']
						//div[@data-onsuccess='onSignIn']/a
						//div[@class='google-sign-in']/a
						
			css		: a[id='google-button']
					  a[class='btn btn-outline-google']
		
					
	3. First Name
			
			id		: firstName
			tagName = input
			
			css 	#firstName
					.form-group input[id='firstName']
					.form-group input[wfd-id='id0']
			
			xpath 	= //input[@id='firstName']
					= (//input[@placeholder='Enter name'])[1]
					= (//input[@class='form-control'])[1]
					  (//input[@type='text'])[1]
					  (//input)[1]

	4. Last Name
			
			id	: lastName
			xpath	: //input[@id='lastName']
					  (//input[@placeholder='Enter name'])[2]
					  (//input[@class='form-control'])[2]
					  (//input[@type='text'])[2]
					  (//input)[2]
					  
			CSS 	:	#lastName
						input[id='lastName']
						.form-group input[id='lastName']
						.form-group input[wfd-id='id1']
						

	5. Email
			
			id: emailInput
			class: form-control is-invalid
			
			xpath : //input[@type='email']
					//input[@class='form-control is-invalid']
					//input[@id='emailInput']
					//input[@placeholder='Enter email']
					(//input)[3]
					
			CSS:	#emailgroup input[type='email']
					#emailgroup input[class='form-control is-invalid']
					.form-group input[id='emailInput']
					.form-group input[placeholder='Enter email']

	6. Password

			id	: passwordInput
			xpath:  (//input[@class='form-control'])[3]
					(//input[@type='password'])[1]
					(//input[@class='form-control'])[3]
					//input[@placeholder='Password']
					(//input)[4]
					
			CSS: 	#passwordInput
					.form-group input[placeholder='Password']
					.form-group input[id='passwordInput']
					.form-group input[id='passwordInput']
					.form-group input[type='password']
					.form-group input[wfd-id='id3']
			
	7. Mobile Number

			id 	: mobileNumberInput
			name: mobileNumberInput
			xpath:  (//input[@class='form-control'])[4]
					(//input[@type='tel'])[1]
					//input[@id='mobileNumberInput']
					(//input)[5]
					//input[@name='mobileNumberInput']
					//input[@placeholder='Mobile number']
					//input[@maxlength='20']
					//input[@minlength='10']
					
			CSS: 	#mobileNumberInput
					.form-group input[name='mobileNumberInput']
					.form-group input[placeholder='Mobile number']
					

	8. Sign up button
			xpath: 	//button[@type='button']
					//button[@id='signup']
					(//button[@class='btn btn-primary'])[1]
					//div[@class='btn-wrap']/button
					//button[contains(text(),'Sign up')]
					
			CSS:	#signup
					.btn-wrap button[id='signup']
					.btn-wrap button[type='button']
					.btn-wrap button[class='btn btn-primary']
					
	9. Login
			LinkText: Log in
			xpath:	//a[contains(.,'Log in')]
					//a[contains(text(),'Log in')]
}










