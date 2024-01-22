import { render, screen } from '@testing-library/react';
import App from './App';

test('renders learn react link', () => {
  render(<App />);
  const linkElement = screen.getByText(/Order Now, Pick Up Later/i);
  expect(linkElement).toBeInTheDocument();
});
