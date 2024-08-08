import './Card.css'

type data = {
    id: number,
    heading: string,
    img: string,
    description: string
}

export default function Card({heading, img, description}: data) {

    return (
        <article>
            <h2>{heading}</h2>
            < img
                src={img}
                width="400" alt={heading}/>
            <p>{description}</p>
        </article>
    )
}