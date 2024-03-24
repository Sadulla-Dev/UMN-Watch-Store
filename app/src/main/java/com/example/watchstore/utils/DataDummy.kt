package com.example.watchstore.utils

import com.example.watchstore.R
import com.example.watchstore.domain.model.ProductItem

object DataDummy {
    fun generateDummyProduct(): List<ProductItem> {
        return listOf(
            ProductItem(
                id = 1,
                title = "Rolex Submariner",
                description = "The Rolex Submariner is an iconic dive watch that has been in production since 1953. It features a water-resistant Oyster case, a unidirectional rotatable bezel, and a self-winding mechanical movement.",
                image = R.drawable.product1,
                unit = "1 piece, Price",
                price = 1499.99,
                nutritions = "N/A",
                review = 4.8,
            ),
            ProductItem(
                id = 2,
                title = "Omega Speedmaster",
                description = "The Omega Speedmaster is a legendary chronograph watch that has been worn by astronauts on all NASA manned missions since 1965. It features a manual-winding chronograph movement and a tachymeter bezel.",
                image = R.drawable.product2,
                unit = "1 piece, Price",
                price = 785.00,
                nutritions = "N/A",
                review = 4.7
            ),
            ProductItem(
                id = 3,
                title = "Cartier Tank",
                description = "The Cartier Tank is a classic dress watch with a rectangular case inspired by the World War I Renault tanks. It features a minimalist dial and a manual-winding movement.",
                image = R.drawable.product3,
                unit = "1 piece, Price",
                price = 630.00,
                nutritions = "N/A",
                review = 4.5
            ),
            ProductItem(
                id = 4,
                title = "Patek Philippe Calatrava",
                description = "The Patek Philippe Calatrava is a timeless dress watch known for its sleek and elegant design. It features a mechanical movement and a simple dial with a minimalist design.",
                image = R.drawable.product4,
                unit = "1 piece, Price",
                price = 2800.00,
                nutritions = "N/A",
                review = 4.9
            ),
            ProductItem(
                id = 5,
                title = "Rolex Datejust",
                description = "The Rolex Datejust is a classic timepiece that features a self-winding mechanical movement, a date window, and a fluted bezel. It is available in various materials, including stainless steel, gold, and two-tone.",
                image = R.drawable.product5,
                unit = "1 piece, Price",
                price = 1150.00,
                nutritions = "N/A",
                review = 4.6
            ),
            ProductItem(
                id = 6,
                title = "Breitling Navitimer",
                description = "The Breitling Navitimer is a pilot's watch with a chronograph function and a circular slide rule bezel, designed for aviators to perform calculations related to flight plans.",
                image = R.drawable.product6,
                unit = "1 piece, Price",
                price = 920.00,
                nutritions = "N/A",
                review = 4.4
            ),
            ProductItem(
                id = 7,
                title = "Audemars Piguet Royal Oak",
                description = "The Audemars Piguet Royal Oak is an iconic luxury sports watch with an octagonal bezel and a distinctive integrated bracelet. It features a self-winding mechanical movement and is known for its bold design.",
                image = R.drawable.product7,
                unit = "1 piece, Price",
                price = 3200.00,
                nutritions = "N/A",
                review = 4.7
            ),
            ProductItem(
                id = 8,
                title = "IWC Portugieser",
                description = "The IWC Portugieser is a dress watch with a large case and a simple, elegant dial. It features a mechanical movement and is known for its timeless design.",
                image = R.drawable.product8,
                unit = "1 piece, Price",
                price = 1450.00,
                nutritions = "N/A",
                review = 4.6
            ),
            ProductItem(
                id = 9,
                title = "Jaeger-LeCoultre Reverso",
                description = "The Jaeger-LeCoultre Reverso is a unique watch with a reversible case design that allows the watch face to be flipped over, protecting it from damage. It features a mechanical movement and a classic Art Deco design.",
                image = R.drawable.product9,
                unit = "1 piece, Price",
                price = 890.00,
                nutritions = "N/A",
                review = 4.8
            ),
            ProductItem(
                id = 10,
                title = "Panerai Luminor",
                description = "The Panerai Luminor is a dive watch with a distinctive cushion-shaped case and a patented crown-locking system. It features a self-winding mechanical movement and is known for its bold and rugged design.",
                image = R.drawable.product10,
                unit = "1 piece, Price",
                price = 1000.00,
                nutritions = "N/A",
                review = 4.5
            ),
        )
    }
}