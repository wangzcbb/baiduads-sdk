"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

    The version of the OpenAPI document: 1.0.1-SNAPSHOT
    Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import baiduads
from baiduads.common.model.api_request_header import ApiRequestHeader
from baiduads.newcreative.model.creative_group_id_request import CreativeGroupIdRequest
globals()['ApiRequestHeader'] = ApiRequestHeader
globals()['CreativeGroupIdRequest'] = CreativeGroupIdRequest
from baiduads.newcreative.model.delete_creative_group_request_wrapper import DeleteCreativeGroupRequestWrapper


class TestDeleteCreativeGroupRequestWrapper(unittest.TestCase):
    """DeleteCreativeGroupRequestWrapper unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testDeleteCreativeGroupRequestWrapper(self):
        """Test DeleteCreativeGroupRequestWrapper"""
        # FIXME: construct object with mandatory attributes with example values
        # model = DeleteCreativeGroupRequestWrapper()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()
