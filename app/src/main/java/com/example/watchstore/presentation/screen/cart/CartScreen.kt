package com.example.watchstore.presentation.screen.cart

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.watchstore.R
import com.example.watchstore.presentation.common.content.ListContentCart
import com.example.watchstore.theme.Black
import com.example.watchstore.theme.DIMENS_16dp
import com.example.watchstore.theme.GilroyFontFamily
import com.example.watchstore.theme.TEXT_SIZE_18sp
import com.example.watchstore.utils.showToastShort
import com.example.watchstore.domain.model.ProductItem

@Composable
fun CartScreen(
    modifier: Modifier = Modifier,
    cartViewModel: CartViewModel = hiltViewModel()
) {
    val productCartList by cartViewModel.productCartList.collectAsState()
    var isDialogOpen by remember { mutableStateOf(false) }
    var selectedItem by remember { mutableStateOf<ProductItem?>(null) }
    val context = LocalContext.current

    Column(
        modifier = modifier.fillMaxSize()
    ) {
        Text(
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(top = DIMENS_16dp),
            text = stringResource(R.string.my_cart),
            fontFamily = GilroyFontFamily,
            fontWeight = FontWeight.Bold,
            fontSize = TEXT_SIZE_18sp,
            color = Black
        )

        Spacer(modifier = Modifier.height(DIMENS_16dp))

        ListContentCart(
            cartProducts = productCartList,
            onClickDeleteCart = { productItem ->
                cartViewModel.deleteCart(productItem.copy(isCart = false))
            },
            onClickSelected = { productItem ->
                selectedItem = productItem
                isDialogOpen = true
            }
        )

        if (isDialogOpen) {
            ConfirmationDialog(
                onConfirm = { phoneNumber ->
                    if (phoneNumber.length >= 7) {
                        selectedItem?.let { productItem ->
                            cartViewModel.cartSelectedItem(productItem.apply {
                                this.phoneNumber = phoneNumber
                            })
                        }
                        isDialogOpen = false
                        selectedItem?.let { cartViewModel.deleteCart(it.copy(isCart = false)) }
                        context.showToastShort("Ordered successfully")
                    }
                },
                onCancel = {
                    isDialogOpen = false
                }
            )
        }
    }
}

