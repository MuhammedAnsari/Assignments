// Get form elements
const surveyForm = document.getElementById('surveyForm');
const submitBtn = document.getElementById('submitBtn');
const resetBtn = document.getElementById('resetBtn');
const popup = document.getElementById('popup');
const closePopup = document.getElementById('closePopup');
const popupContent = document.getElementById('popup-content');

submitBtn.addEventListener('click', () => {
    // Get form values
    const firstName = document.getElementById('firstName').value;
    const lastName = document.getElementById('lastName').value;
    const dob = document.getElementById('dob').value;
    const country = document.getElementById('country').value;
    const genderCheckboxes = document.querySelectorAll('input[name="gender"]:checked');
    const profession = document.getElementById('profession').value;
    const email = document.getElementById('email').value;
    const mobile = document.getElementById('mobile').value;

    // Check if all fields are filled
    if (!firstName || !lastName || !dob || !country || genderCheckboxes.length === 0 || !profession || !email || !mobile) {
        alert('Please fill in all the fields.');
        return;
    }

    // Build the message for the popup
    let popupMessage = `
        <p><strong>First Name:</strong> ${firstName}</p>
        <p><strong>Last Name:</strong> ${lastName}</p>
        <p><strong>Date of Birth:</strong> ${dob}</p>
        <p><strong>Country:</strong> ${country}</p>
        <p><strong>Gender:</strong> ${Array.from(genderCheckboxes).map(checkbox => checkbox.value).join(', ')}</p>
        <p><strong>Profession:</strong> ${profession}</p>
        <p><strong>Email:</strong> ${email}</p>
        <p><strong>Mobile Number:</strong> ${mobile}</p>
    `;

    // Show the popup
    popupContent.innerHTML = popupMessage;
    popup.style.display = 'block';

    // Clear form 
    surveyForm.reset();
});

// reset button function
resetBtn.addEventListener('click', () => {
    surveyForm.reset();
});

// Close popup
closePopup.addEventListener('click', () => {
    popup.style.display = 'none';
});
