document.getElementById('submitBtn').addEventListener('click', function () {
    const username = document.getElementById('username').value;
    const email = document.getElementById('email').value;
    const password = document.getElementById('password').value;

    const userData = {
        username: username,
        email: email,
        password: password
    };

    fetch('/api/user/add', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(userData)
    })
    // .then(response => response.json())
    // .then(data => {
    //     // Handle the response, e.g., show a success message
    //     alert('User data submitted successfully!');
    // })
    // .catch(error => {
    //     // Handle errors
    //     alert('An error occurred while submitting user data.');
    // });
});
