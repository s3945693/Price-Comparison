import React, { useEffect, useState } from 'react'
import "./FAQ.css";


export const FAQ = () => {
  useEffect(() => {
    window.scrollTo(0, 0)
  }, [])


  const [activesection, setactivesection] = useState(0)


  const faq = [
    {
      id: 1,
      question: 'How does SuperPrice ensure the accuracy of product prices and availability?',
      answer: 'SuperPrice uses real-time data integration with local supermarkets and stores to provide up-to-date information on product prices and availability. Our system constantly fetches data from these retailers to ensure accuracy.'
    },
    {
      id: 2,
      question: 'Can I schedule a specific delivery time for my groceries?',
      answer: 'Yes, SuperPrice offers multiple delivery options, including the ability to schedule specific delivery time slots. This feature provides flexibility, allowing you to choose a convenient delivery window.'
    },
    {
      id: 3,
      question: 'Are user reviews and ratings available for supermarkets and products?',
      answer: 'Absolutely! SuperPrice allows users to leave reviews and ratings for both supermarkets and individual products. This feature helps shoppers make informed decisions based on the experiences of others.'
    },
    {
      id: 4,
      question: 'How can I find specific products or categories within the SuperPrice application?',
      answer: 'SuperPrice provides a comprehensive search feature that allows you to easily find specific products or browse through different categories. The search functionality ensures a smooth and hassle-free shopping experience.'
    },
    {
      id: 5,
      question: 'Is SuperPrice\'s application interface user-friendly for all types of shoppers?',
      answer: 'Yes, SuperPrice prioritizes simplicity and ease of use. Our user-friendly and intuitive interface is designed to cater to a wide range of users, ensuring a seamless experience for both novice and experienced shoppers.'
    }
  ]

  return (
    <div className='extrapage'>
      {/* <p>faq</p> */}

      <div className='faqcontainer'>

        {
          faq.map((item, index) => {
            return (
              activesection == item.id ?
                <div className='faq'>
                  <div className='faqhead'>
                    <h1>
                      {item.question}
                    </h1>
                    <svg xmlns="http://www.w3.org/2000/svg" fill="none" viewBox="0 0 24 24" strokeWidth={1.5} stroke="currentColor" className="w-6 h-6"
                      onClick={() => setactivesection(0)}
                    >
                      <path strokeLinecap="round" strokeLinejoin="round" d="M6 18L18 6M6 6l12 12" />
                    </svg>
                  </div>
                  <div className='faqbody'>
                    <p>
                      {item.answer}
                    </p>
                  </div>
                </div>
                :
                <div className='faq'>
                  <div className='faqhead'>
                    <h1>{item.question}</h1>
                    <svg xmlns="http://www.w3.org/2000/svg" fill="none" viewBox="0 0 24 24" strokeWidth={1.5} stroke="currentColor" className="w-6 h-6"
                      onClick={() => setactivesection(item.id)}
                    >
                      <path strokeLinecap="round" strokeLinejoin="round" d="M19.5 8.25l-7.5 7.5-7.5-7.5" />
                    </svg>

                  </div>
                </div>
            )
          })
        }


      </div>

    </div>

    
  )
}

