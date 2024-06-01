describe("Test page", () => {
  before(() => {
    cy.visit("maruti-suzuki-cars/swift");
    cy.waitUntilDomInteractive();
  });

    it("Verify visibility of Maruti swift-new Colours", { tags: TAG.carwale }, () =>  {
        cy.get('[data-testing-id="model-page-colors-section"]').should("be.visible");
        // Add more assertions or actions as needed
    });


    it("Verify visibility of Maruti swift-new Mileage", { tags: TAG.carwale }, () =>  {
        cy.get('[data-testing-id="mileage-section"]').should("be.visible");
        // Add more assertions or actions as needed
    });


    it("Verify visibility of Maruti swift-new 2024 News", { tags: TAG.carwale }, () =>  {
        cy.get('[data-testing-id="news-section-model"]').should("be.visible");
        // Add more assertions or actions as needed
    });


    it("Verify visibility of Maruti swift-new Expert Reviews", { tags: TAG.carwale }, () =>  {
        cy.get('[data-testing-id="expert-reviews-section"]').should("be.visible");
        // Add more assertions or actions as needed
    });


    it("Verify visibility of Maruti swift-new Videos", { tags: TAG.carwale }, () =>  {
        cy.get('[data-testing-id="videos-section"]').should("be.visible");
        // Add more assertions or actions as needed
    });


    it("Verify visibility of swift-new Images", { tags: TAG.carwale }, () =>  {
        cy.get('[data-testing-id="images-section"]').should("be.visible");
        // Add more assertions or actions as needed
    });


    it("Verify visibility of FAQs About Maruti swift-new", { tags: TAG.carwale }, () =>  {
        cy.get('[data-testing-id="faq-section"]').should("be.visible");
        // Add more assertions or actions as needed
    });


    it("Verify visibility of FAQs About Maruti swift-new", { tags: TAG.carwale }, () =>  {
        cy.get('[data-testing-id="faqs-section"]').should("be.visible");
        // Add more assertions or actions as needed
    });


    it("Verify visibility of Popular Upcoming Cars", { tags: TAG.carwale }, () =>  {
        cy.get('[data-testing-id="upcoming-cars-section"]').should("be.visible");
        // Add more assertions or actions as needed
    });


    it("Verify visibility of Maruti swift-new Price in India", { tags: TAG.carwale }, () =>  {
        cy.get('[data-testing-id="nearby-city-section"]').should("be.visible");
        // Add more assertions or actions as needed
    });


    it("Verify visibility of Car Buyer's Tools", { tags: TAG.carwale }, () =>  {
        cy.get('[data-testing-id="car-buyers-tools"]').should("be.visible");
        // Add more assertions or actions as needed
    });
});