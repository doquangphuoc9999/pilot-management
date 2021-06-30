let products = {};

products.initProductTable = function () {
    console.log('Vào init table')
    $('#product-dataTables').DataTable({
        ajax: {
            url: `http://localhost:8080/api/products`,
            method: "GET",
            dataType: "json",
            dataSrc: ""
        },
        columns: [
            {
                data: 'nameProduct', title: 'Tên sản phẩm', orderable: true,
                'render': function (data, type, row) {
                    return data;
                }
            },
            {
                data: 'urlImage', title: 'Ảnh',
                'render': function (data, type, row) {
                    return `<img src="${data}" alt="Ảnh sản phẩm" style="max-width: 200px; max-height: 150px; width: 100%; height: 100%" class="img-thumbnail">`;
                }
            },
            {
                data: 'price', name: 'price', title: 'Giá',
                'render': function (data, type, row) {
                    return data.toLocaleString('it-IT', {style : 'currency', currency : 'VND'});
                }
            },
            {
                data: `productType`, name: `productType`, title: 'Loại sản phẩm',
                'render': function (data, type, row) {
                    return data.nameProductType;
                }
            },
            {
                data: "id", name: "action", title: "Chức năng", orderable: false,
                "render": function (data, type, row, meta) {
                    return "<a class='mr-2' href='javascript:;' title='Chỉnh sửa' onclick='products.get(" + data + ")'><i class='fa fa-edit'></i></a> " +
                        "<a class='mr-2' href='javascript:;' title='Xóa' onclick='products.delete(" + data + ")' ><i class='fa fa-trash'></i></a>" +
                        "<a class='mr-2' href='javascript:;' title='Thông tin chi tiết' onclick='products.viewProduct(" + data + ")' ><i class='fas fa-eye'></i></a>"
                }
            },

        ],

        autofill: true,
        select: true,
        responsive: true,
        buttons: true,
        length: 10,
        language: {
            searchPlaceholder: "Tìm tên sản phẩm.......",
            "sProcessing": "Đang xử lý...",
            "sLengthMenu": "Xem _MENU_ mục",
            "sZeroRecords": "Không tìm thấy sản phẩm nào phù hợp",
            "sInfo": "Đang xem _START_ đến _END_ trong tổng số _TOTAL_ sản phẩm",
            "sInfoEmpty": "Đang xem 0 đến 0 trong tổng số 0 mục",
            "sInfoFiltered": "(được lọc từ _MAX_ mục)",
            "sSearch": "Tìm kiếm:",
            "oPaginate": {
                "sFirst": "Đầu",
                "sPrevious": "Trước",
                "sNext": "Tiếp",
                "sLast": "Cuối"
            }
        }
    });
};

// view sản phẩm

products.viewProduct = function (id) {
    $.ajax({
       url: `http://localhost:8080/api/products/${id}`,
       method: "GET",
       dataType: "json",
       success: function (data) {
           $('#formView')[0].reset();
           $('#modalViewTitle').html('Chi tiết sản phẩm');
           $('#idProductView').html(data.id);
           $('#view-upload').html(
               `<img src="${data.urlImage}" style="max-width: 200px; max-height: 150px; width: 100%; height: 100%" alt="Ảnh sản phẩm" class="img-thumbnail">`
           );
           $('#productNameView').html(data.nameProduct);
           $('#priceView').html(data.price.toLocaleString('it-IT', {style : 'currency', currency : 'VND'}));
           $('#productTypeView').html(data.productType.nameProductType);
           $('#modalView').modal('show');
       }
    });
}

// save product
products.saveImage = function () {
    $("#save-btn").html(
        ``
    );
    let form = new FormData();
    form.append("file", $('#multiImage')[0].files[0]);
    $('#upload-loading').html('Đang tải ảnh...');
    $.ajax({
        url: `${url}/upload`,
        type: "POST",
        data: form,
        processData: false,
        contentType: false,
        success: function (data) {
            $('#upload-loading').html('');
            $("#imgUrl").val(data.url);
            $("#done-upload").html(
                `<img src="${data.url}" alt="Ảnh sản phẩm" style="max-width: 300px; max-height: 300px; width: 100%; height: 100%" class="img-thumbnail">`
            );
            $("#save-btn").html(
                `<a href="javascript:;" class="btn btn-primary"
                               onclick="products.save()">Lưu</a>`
            );
        }
    });
}


// xóa sản phẩm
products.delete = function (id) {
    bootbox.confirm({
        title: "Xóa sản phẩm",
        message: "Bạn có muốn xóa sản phẩm này?",
        buttons: {
            cancel: {
                label: '<i class="fa fa-times"></i> Nghĩ lại'
            },
            confirm: {
                label: '<i class="fa fa-check"></i> Có'
            }
        },
        callback: function (result) {
            if (result) {
                $.ajax({
                    url: `http://localhost:8080/api/products/${id}`,
                    method: "DELETE",
                    dataType: "json",
                    success: function () {
                        Command: toastr["success"]("Xóa sản phẩm thành công");
                        toastr.options = {
                            "closeButton": false,
                            "debug": false,
                            "newestOnTop": false,
                            "progressBar": true,
                            "positionClass": "toast-top-right",
                            "preventDuplicates": false,
                            "onclick": null,
                            "showDuration": "300",
                            "hideDuration": "1000",
                            "timeOut": "2000",
                            "extendedTimeOut": "1000",
                            "showEasing": "swing",
                            "hideEasing": "linear",
                            "showMethod": "fadeIn",
                            "hideMethod": "fadeOut"
                        };
                        $('#modalAddEdit').modal('hide');
                        $('#product-dataTables').DataTable().ajax.reload();
                    }
                });
            }
        }
    });
}


// get product
products.get = function (id) {
    $('#done-upload').html('');
    $.ajax({
        url: `http://localhost:8080/api/products/${id}`,
        method: "GET",
        dataType: "json",
        success: function (data) {
            $('#formAddEdit')[0].reset();
            $('#modalTitle').html('Chỉnh sửa sản phẩm');
            $('#done-upload').html(
                `<img src="${data.urlImage}" style="max-width: 200px; max-height: 150px; width: 100%; height: 100%" alt="Ảnh sản phẩm" class="img-thumbnail">`
            );
            $('#idProduct').val(data.id);
            $('#productName').val(data.nameProduct);
            $('#price').val(data.price);
            $('#productType').val(data.productType.id);
            $('#modalAddEdit').modal('show');
        }
    });
}

// modal add and edit
products.addNew = function () {
    console.log('vo add new');
    $('#formAddEdit')[0].reset();

    $('#done-upload').html('');
    $('#idProduct').val("");
    $('#modalTitle').html("Thêm sản phẩm mới");
    products.resetForm();
    $('#modalAddEdit').modal('show');
};

// save product
products.save = function () {
    if ($('#formAddEdit')) {
        console.log("vo form add")
        if ($('#idProduct').val() === "") {
            let productObj = {};
            productObj.nameProduct = $('#productName').val();
            productObj.price = Number($('#price').val());
            productObj.urlImage = $('#imgUrl').val();
            let productTypeObj = {};
            productTypeObj.id = Number($('#productType').val());
            productTypeObj.nameProductType = $("#productType option").html();
            productObj.productType = productTypeObj;
            $.ajax({
                url: `http://localhost:8080/api/products`,
                method: "POST",
                dataType: "json",
                contentType: "application/json",
                data: JSON.stringify(productObj),
                success: function () {
                    Command: toastr["success"]("Thêm sản phẩm thành công");
                    toastr.options = {
                        "closeButton": false,
                        "debug": false,
                        "newestOnTop": false,
                        "progressBar": true,
                        "positionClass": "toast-top-right",
                        "preventDuplicates": false,
                        "onclick": null,
                        "showDuration": "300",
                        "hideDuration": "1000",
                        "timeOut": "2000",
                        "extendedTimeOut": "1000",
                        "showEasing": "swing",
                        "hideEasing": "linear",
                        "showMethod": "fadeIn",
                        "hideMethod": "fadeOut"
                    };
                    $('#modalAddEdit').modal('hide');
                    $('#product-dataTables').DataTable().ajax.reload();
                },
                error: function (data) {
                    $('#name-product').html(data.responseJSON.nameProduct);
                    $('#price-product').html(data.responseJSON.price);
                }
            });
        } else {
            console.log('vo edit')

            let productObj = {};
            productObj.id = Number($('#idProduct').val());
            productObj.nameProduct = $('#productName').val();
            productObj.urlImage = $('#imgUrl').val();
            productObj.price = Number($('#price').val());
            let productTypeObj = {};
            productTypeObj.id = Number($('#productType').val());
            productTypeObj.nameProductType = $("#productType option").html();
            productObj.productType = productTypeObj;

            $.ajax({
                url: `http://localhost:8080/api/products/${productObj.id}`,
                method: "PUT",
                dataType: "json",
                contentType: "application/json",
                data: JSON.stringify(productObj),
                success: function (data) {
                    Command: toastr["success"]("Sửa sản phẩm thành công");
                    toastr.options = {
                        "closeButton": false,
                        "debug": false,
                        "newestOnTop": false,
                        "progressBar": true,
                        "positionClass": "toast-top-right",
                        "preventDuplicates": false,
                        "onclick": null,
                        "showDuration": "300",
                        "hideDuration": "1000",
                        "timeOut": "2000",
                        "extendedTimeOut": "1000",
                        "showEasing": "swing",
                        "hideEasing": "linear",
                        "showMethod": "fadeIn",
                        "hideMethod": "fadeOut"
                    };
                    $('#modalAddEdit').modal('hide');
                    $('#product-dataTables').DataTable().ajax.reload();
                },
                error: function (data) {
                    $('#name-product').html(data.responseJSON.nameProduct);
                    $('#price-product').html(data.responseJSON.price);
                }
            });
        }
    }

}

// reset form
products.resetForm = function () {
    $('#formAddEdit')[0].reset();
};


products.init = function () {
    console.log("vao init");
    products.initProductTable();
};


$(document).ready(function () {
    products.init();
});