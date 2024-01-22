import { Container, Row, Col } from "react-bootstrap";

export const Footer = () => {
  const leftAlignedText = { textAlign: "left" };

  return (
    <footer id="footer">
      <Container>
        {/* First Row */}
        <Row>
          <Col style={leftAlignedText}>
            <strong>Customer Service</strong>
          </Col>
          <Col style={leftAlignedText}>
            <strong>Shop Groceries Online</strong>
          </Col>
          <Col style={leftAlignedText}>
            <strong>Useful Links</strong>
          </Col>
          <Col style={leftAlignedText}>
            <strong>About SuperPrice</strong>
          </Col>
        </Row>

        {/* Second Row */}
        <Row>
          <Col style={leftAlignedText}>
            <p><a href="">Help & Support</a></p>
          </Col>
          <Col style={leftAlignedText}>
            <p><a href="">View my Account</a></p>
          </Col>
          <Col style={leftAlignedText}>
            <p><a href="">Everyday Rewards</a></p>
          </Col>
          <Col style={leftAlignedText}>
            <p><a href="">Careers</a></p>
          </Col>
        </Row>

        {/* Third Row */}
        <Row>
          <Col style={leftAlignedText}>
            <p><a href="">Contact Us</a></p>
          </Col>
          <Col style={leftAlignedText}>
            <p><a href="">Pick Up</a></p>
          </Col>
          <Col style={leftAlignedText}>
            <p><a href="">Announcements</a></p>
          </Col>
          <Col style={leftAlignedText}>
            <p><a href=""></a></p>
          </Col>
        </Row>

        {/* Fourth Row */}
        <Row>
          <Col style={leftAlignedText}>
            <p><a href="">Feedback</a></p>
          </Col>
          <Col style={leftAlignedText}>
            <p><a href="">Delivery</a></p>
          </Col>
          <Col style={leftAlignedText}>
            <p><a href="">Recipes & Easy Dinner Ideas</a></p>
          </Col>
          <Col style={leftAlignedText}>
            <p><a href=""></a></p>
          </Col>
        </Row>

        {/* Fifth Row */}
        <Row>
          <Col style={leftAlignedText}>
            <p><a href="">Product Safety + Recalls</a></p>
          </Col>
          <Col style={leftAlignedText}>
            <p><a href="">New to Online Shopping?</a></p>
          </Col>
          <Col style={leftAlignedText}>
            <p><a href=""></a></p>
          </Col>
          <Col style={leftAlignedText}>
            <p><a href=""></a></p>
          </Col>
        </Row>
      </Container>
    </footer>
  );
};
