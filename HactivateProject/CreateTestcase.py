import requests
from bs4 import BeautifulSoup

# URL of the webpage to scrape
url = 'https://dev.carwale.com/maruti-suzuki-cars/swift'

# Send a GET request to the URL
response = requests.get(url)

# Parse the HTML content
soup = BeautifulSoup(response.text, 'html.parser')

test_cases = []

# Find all <section> elements with data-testing-id attribute
section_elements = soup.find_all('section', {'data-testing-id': True})

for section in section_elements:
    # Get the data-testing-id value of the section
    section_dti = section['data-testing-id']
    
    h1_tag = section.find('h2')
 
    if h1_tag:
        # Get the text of the h1 tag
        h1_text = h1_tag.get_text(strip=True)
        print(f"Verify visibility of {h1_text} , data-testing-id= {section_dti}")

            # Create a dictionary representing the test case
        test_case = {
            "name": h1_text,
            "data_testing_id": section_dti,
            "tag": "{ tags: TAG.carwale }",
        }
        
        # Append the test case to the list of test cases
        test_cases.append(test_case)


# Template for Cypress code
cypress_template = """

    it("Verify visibility of {test_name}", {tags}, () =>  {{
        cy.get('[data-testing-id="{data_testing_id}"]').should("be.visible");
        // Add more assertions or actions as needed
    }});
"""

# Generate Cypress code
generated_code = """describe("Test page", () => {
  before(() => {
    cy.visit("maruti-suzuki-cars/swift");
    cy.waitUntilDomInteractive();
  });"""
for test_case in test_cases:
    generated_code += cypress_template.format(test_name=test_case["name"], tags=test_case["tag"],data_testing_id=test_case["data_testing_id"])

generated_code+="""});"""

# Write generated code to a file
with open('generated_tests.js', 'w') as file:
    file.write(generated_code)

